package org.fuse.cidpoc.a;

import java.util.Collections;
import java.util.List;

import org.fuse.cidpoc.Item;

public class A extends Item {

    @Override
    public Capability getCapability() {
        return new Capability("A", 3);
    }

    @Override
    public List<Item> getDependencies() {
        return Collections.emptyList();
    }
}