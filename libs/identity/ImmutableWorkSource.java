package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ImmutableWorkSource;
import defpackage.arxc;
import defpackage.asrj;
import defpackage.bwpx;
import defpackage.bwpy;
import defpackage.bwqa;
import defpackage.fuur;
import defpackage.fuuw;
import defpackage.fuux;
import defpackage.fuuy;
import defpackage.fuvz;
import defpackage.fuwa;
import defpackage.fuwb;
import defpackage.fvaf;
import defpackage.fvbj;
import defpackage.fvbo;
import defpackage.fvcf;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ImmutableWorkSource extends AbstractSafeParcelable implements List, j$.util.List, fvcf {
    public static final Parcelable.Creator CREATOR = new bwpy();
    public static final ImmutableWorkSource a = new ImmutableWorkSource(new WorkSource());
    public static final fuuw b = fuux.a(fuuy.c, new fvaf() { // from class: bwpv
        @Override // defpackage.fvaf
        public final Object a() {
            return new ImmutableWorkSource(asrj.c(Process.myUid(), "com.google.android.gms"));
        }
    });
    public final WorkSource c;
    private final /* synthetic */ bwqa d;

    @fuur
    public ImmutableWorkSource(WorkSource workSource) {
        fvbo.f(workSource, "workSource");
        this.d = new bwqa(workSource);
        this.c = workSource;
    }

    public static final ImmutableWorkSource c(WorkSource workSource) {
        return (workSource == null || asrj.g(workSource)) ? a : new ImmutableWorkSource(new WorkSource(workSource));
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
        if (!(obj instanceof bwpx)) {
            return false;
        }
        bwpx bwpxVar = (bwpx) obj;
        fvbo.f(bwpxVar, "element");
        return this.d.contains(bwpxVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        fvbo.f(collection, "elements");
        return this.d.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImmutableWorkSource) && fvbo.n(this.c, ((ImmutableWorkSource) obj).c);
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
        if (!(obj instanceof bwpx)) {
            return -1;
        }
        bwpx bwpxVar = (bwpx) obj;
        fvbo.f(bwpxVar, "element");
        return this.d.indexOf(bwpxVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new fuvz(this.d);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof bwpx)) {
            return -1;
        }
        bwpx bwpxVar = (bwpx) obj;
        fvbo.f(bwpxVar, "element");
        return this.d.lastIndexOf(bwpxVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new fuwa(this.d, 0);
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
        return new fuwb(this.d, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fvbj.a(this);
    }

    public final String toString() {
        String workSource = this.c.toString();
        fvbo.e(workSource, "toString(...)");
        return workSource;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        WorkSource workSource = this.c;
        int a2 = arxc.a(parcel);
        arxc.t(parcel, 1, workSource, i, false);
        arxc.c(parcel, a2);
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
        return new fuwa(this.d, i);
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
        fvbo.f(objArr, "array");
        return fvbj.b(this, objArr);
    }
}
