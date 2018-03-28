import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mommifierTest {
    @Test
    public void shouldReturnEmptyString(){
        Mommifier emp = new Mommifier();
        assertEquals("", emp.mommify(""));
    }

    @Test
    public void shouldReturnMommy() {
        assertEquals("mommy", new Mommifier().mommify("a"));
    }

    @Test
    public void shouldReturnH(){
        assertEquals("h", new Mommifier().mommify("h"));
    }

    @Test
    public void shouldReplaceVowel() {
        assertEquals("hmommys", new Mommifier().mommify("his"));
    }
}
