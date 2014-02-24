// http://java.sun.com/docs/books/tutorial/reflect/class/classMembers.html
//
// java ClassMemberSpy java.lang.ClassCastException CONSTRUCTOR
// java ClassMemberSpy java.nio.channels.ReadableByteChannel METHOD
// java ClassMemberSpy ClassMember FIELD METHOD


import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import static java.lang.System.out;
import java.lang.annotation.Annotation;

public class ClassScanner {
	public static void main(String... args) {
		try {
			Class<?> c = Class.forName(args[0]);
			out.format("Class:%n  %s%n%n", c.getCanonicalName());

			out.format("Type Parameters:%n");
			TypeVariable[] tv = c.getTypeParameters();
			if (tv.length != 0) {
				out.format("  ");
				for (TypeVariable t : tv)
					out.format("%s ", t.getName());
				out.format("%n%n");
			} else {
				out.format("  -- No Type Parameters --%n%n");
			}

			out.format("Implemented Interfaces:%n");
			Type[] intfs = c.getGenericInterfaces();
			if (intfs.length != 0) {
				for (Type intf : intfs)
					out.format("  %s%n", intf.toString());
				out.format("%n");
			} else {
				out.format("  -- No Implemented Interfaces --%n%n");
			}

			out.format("Inheritance Path:%n");
			List<Class> l = new ArrayList<Class>();
			printAncestor(c, l);
			if (l.size() != 0) {
				for (Class<?> cl : l)
					out.format("  %s%n", cl.getCanonicalName());
				out.format("%n");
			} else {
				out.format("  -- No Super Classes --%n%n");
			}

			out.format("Annotations:%n");
			Annotation[] ann = c.getAnnotations();
			if (ann.length != 0) {
				for (Annotation a : ann)
					out.format("  %s%n", a.toString());
				out.format("%n");
			} else {
				out.format("  -- No Annotations --%n%n");
			}

			Package p = c.getPackage();
			out.format("Package:%n  %s%n%n",(p != null ? p.getName() : "-- No Package --"));

			printMembers(c.getConstructors(), "Constuctors");
			printMembers(c.getFields(), "Fields");
			printMembers(c.getMethods(), "Methods");
			printClasses(c);


		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}

	private static void printAncestor(Class<?> c, List<Class> l) {
		Class<?> ancestor = c.getSuperclass();
		if (ancestor != null) {
			l.add(ancestor);
			printAncestor(ancestor, l);
 		}
	}

	private static void printMembers(Member[] mbrs, String s) {
		out.format("%s:%n", s);
		for (Member mbr : mbrs) {
			Annotation[] anots = null;
			if (mbr instanceof Field) {
				printAnnotations(((Field)mbr).getDeclaredAnnotations());
				out.format("  %s%n", ((Field)mbr).toGenericString());
			}
			else if (mbr instanceof Constructor) {
				printAnnotations(((Constructor)mbr).getDeclaredAnnotations());
				out.format("  %s%n", ((Constructor)mbr).toGenericString());
			}
			else if (mbr instanceof Method) {
				printAnnotations(((Method)mbr).getDeclaredAnnotations());
				out.format("  %s%n", ((Method)mbr).toGenericString());
			}
		}
		if (mbrs.length == 0)
			out.format("  -- No %s --%n", s);
		out.format("%n");
	}

	private static void printAnnotations  (Annotation[] anots) {
		for (Annotation anot : anots)
			System.out.println("\t" + anot);
	}

	private static void printClasses(Class<?> c) {
		out.format("Classes:%n");
		Class<?>[] clss = c.getClasses();
		for (Class<?> cls : clss)
			out.format("  %s%n", cls.getCanonicalName());
		if (clss.length == 0)
			out.format("  -- No member interfaces, classes, or enums --%n");
		out.format("%n");
	}
}
