package chapter17.annotation;

public class AnnotationSample {
	// public void useDeprecated() {
	// 	AnnotationDeprecated child = new AnnotationDeprecated();
	// 	child.noMoreUse();
	// }

	@SuppressWarnings("deprecated")
	public void useDeprecated() {
		AnnotationDeprecated child = new AnnotationDeprecated();
		child.noMoreUse();
	}
}
