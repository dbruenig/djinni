// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from example.djinni

package com.dropbox.textsort;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class SortItems {
    public abstract void sort(ItemList items);

    public static native SortItems createWithListener(TextboxListener listener);

    public static final class NativeProxy extends SortItems
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private NativeProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public void sort(ItemList items)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_sort(this.nativeRef, items);
        }
        private native void native_sort(long _nativeRef, ItemList items);
    }
}