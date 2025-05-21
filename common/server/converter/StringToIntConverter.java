package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ashm;
import defpackage.ashn;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class StringToIntConverter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ashm();
    final int a;
    public final HashMap b;
    public final SparseArray c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ashn();
        final int a;
        final String b;
        final int c;

        public Entry(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, this.a);
            arxc.v(parcel, 2, this.b, false);
            arxc.o(parcel, 3, this.c);
            arxc.c(parcel, a);
        }

        public Entry(String str, int i) {
            this.a = 1;
            this.b = str;
            this.c = i;
        }
    }

    public StringToIntConverter() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new Entry(str, ((Integer) hashMap.get(str)).intValue()));
        }
        arxc.y(parcel, 2, arrayList, false);
        arxc.c(parcel, a);
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.a = i;
        this.b = new HashMap();
        this.c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            String str = entry.b;
            int i3 = entry.c;
            this.b.put(str, Integer.valueOf(i3));
            this.c.put(i3, str);
        }
    }
}
