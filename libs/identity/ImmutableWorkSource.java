package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ImmutableWorkSource;
import defpackage.atzr;
import defpackage.auvd;
import defpackage.byyk;
import defpackage.byyl;
import defpackage.byyn;
import defpackage.fxqp;
import defpackage.fxqu;
import defpackage.fxqv;
import defpackage.fxqw;
import defpackage.fxrx;
import defpackage.fxry;
import defpackage.fxrz;
import defpackage.fxwd;
import defpackage.fxxh;
import defpackage.fxxm;
import defpackage.fxyd;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ImmutableWorkSource extends AbstractSafeParcelable implements List, j$.util.List, fxyd {
    public static final Parcelable.Creator CREATOR = new byyl();
    public static final ImmutableWorkSource a = new ImmutableWorkSource(new WorkSource());
    public static final fxqu b = fxqv.a(fxqw.c, new fxwd() { // from class: byyi
        @Override // defpackage.fxwd
        public final Object a() {
            return new ImmutableWorkSource(auvd.c(Process.myUid(), "com.google.android.gms"));
        }
    });
    public final WorkSource c;
    private final /* synthetic */ byyn d;

    @fxqp
    public ImmutableWorkSource(WorkSource workSource) {
        fxxm.f(workSource, "workSource");
        this.d = new byyn(workSource);
        this.c = workSource;
    }

    public static final ImmutableWorkSource c(WorkSource workSource) {
        return (workSource == null || auvd.g(workSource)) ? a : new ImmutableWorkSource(new WorkSource(workSource));
    }

    public final int a() {
        return this.d.a();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final WorkSource b() {
        return new WorkSource(this.c);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof byyk)) {
            return false;
        }
        byyk byykVar = (byyk) obj;
        fxxm.f(byykVar, "element");
        return this.d.contains(byykVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        fxxm.f(collection, "elements");
        return this.d.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImmutableWorkSource) && fxxm.n(this.c, ((ImmutableWorkSource) obj).c);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.d.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof byyk)) {
            return -1;
        }
        byyk byykVar = (byyk) obj;
        fxxm.f(byykVar, "element");
        return this.d.indexOf(byykVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new fxrx(this.d);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof byyk)) {
            return -1;
        }
        byyk byykVar = (byyk) obj;
        fxxm.f(byykVar, "element");
        return this.d.lastIndexOf(byykVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new fxry(this.d, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new fxrz(this.d, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fxxh.a(this);
    }

    public final String toString() {
        String workSource = this.c.toString();
        fxxm.e(workSource, "toString(...)");
        return workSource;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        WorkSource workSource = this.c;
        int a2 = atzr.a(parcel);
        atzr.t(parcel, 1, workSource, i, false);
        atzr.c(parcel, a2);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new fxry(this.d, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        fxxm.f(objArr, "array");
        return fxxh.b(this, objArr);
    }
}
