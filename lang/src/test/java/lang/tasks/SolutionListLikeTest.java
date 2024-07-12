package lang.tasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionListLikeTest {

	@Test
	void testWhoLikesIt() {
		assertEquals("no one likes this", SolutionListLike.whoLikesIt());
        assertEquals("Peter likes this", SolutionListLike.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", SolutionListLike.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", SolutionListLike.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", SolutionListLike.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
	}

}
