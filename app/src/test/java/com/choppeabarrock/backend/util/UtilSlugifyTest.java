package com.choppeabarrock.backend.util;

import com.github.slugify.Slugify;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UtilSlugifyTest {

    Slugify slg;

    @BeforeEach
    public void beforeEach() throws Exception {

        // Now you're able to use it:

        slg = new Slugify();

    }

    @Test // use it
    public void testSlugify_nowYouReAbleToUseIt() throws Exception {

        String result = slg.slugify("Hello, world!");

        assertEquals("hello-world", result, "lg.slugify(\"Hello, world!\"");

//        log.debug(result);

    }


    @Test // You can set custom replacements for Slugify
    public void testSlugify_youCanSetCustomReplacementsForSlugify() throws Exception {

        String result = slg.withCustomReplacement("hello", "world")

                .withCustomReplacement("foo", "bar")

                .slugify("hello Bar");

//        log.debug(result);

        assertEquals("world-bar", result, "lg.slugify(\"Hello Bar\"");

    }

    @Test // or multiple at once
    public void testSlugify_orMultipleAtOnce() throws Exception {

        String result = slg

                .withCustomReplacements(new HashMap<String, String>() {{
                    put("hello", "world");
                    put("foo", "bar");
                }})

                .slugify("hello foo");

        assertEquals("world-bar", result, "lg.slugify(\"hello foo\"");

    }

    @Test // Or if you want case sensitivity:
    public void testSlugify_orIfYouWantCaseSensitivity() throws Exception {

        String result = slg

                .withLowerCase(false)

                .slugify("Hello, World!");

        assertEquals("Hello-World", result, "lg.slugify(\"Hello, World!\"");

    }

}
