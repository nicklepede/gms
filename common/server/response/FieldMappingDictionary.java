package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asig;
import defpackage.asih;
import defpackage.asii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FieldMappingDictionary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asih();
    final int a;
    public final String b;
    private final HashMap c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new asii();
        final int a;
        final String b;
        final ArrayList c;

        public Entry(int i, String str, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, this.a);
            arxc.v(parcel, 2, this.b, false);
            arxc.y(parcel, 3, this.c, false);
            arxc.c(parcel, a);
        }

        public Entry(String str, Map map) {
            ArrayList arrayList;
            this.a = 1;
            this.b = str;
            if (map == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (String str2 : map.keySet()) {
                    arrayList.add(new FieldMapPair(str2, (FastJsonResponse$Field) map.get(str2)));
                }
            }
            this.c = arrayList;
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class FieldMapPair extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new asig();
        final int a;
        final String b;
        final FastJsonResponse$Field c;

        public FieldMapPair(int i, String str, FastJsonResponse$Field fastJsonResponse$Field) {
            this.a = i;
            this.b = str;
            this.c = fastJsonResponse$Field;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, this.a);
            arxc.v(parcel, 2, this.b, false);
            arxc.t(parcel, 3, this.c, i, false);
            arxc.c(parcel, a);
        }

        public FieldMapPair(String str, FastJsonResponse$Field fastJsonResponse$Field) {
            this.a = 1;
            this.b = str;
            this.c = fastJsonResponse$Field;
        }
    }

    public FieldMappingDictionary(int i, ArrayList arrayList, String str) {
        this.a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            String str2 = entry.b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = entry.c;
            arwm.s(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                FieldMapPair fieldMapPair = (FieldMapPair) entry.c.get(i3);
                hashMap2.put(fieldMapPair.b, fieldMapPair.c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.c = hashMap;
        arwm.s(str);
        this.b = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.c.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse$Field) map.get((String) it2.next())).j = this;
            }
        }
    }

    public final Map a(String str) {
        return (Map) this.c.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.c;
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.c;
        for (String str : hashMap.keySet()) {
            arrayList.add(new Entry(str, (Map) hashMap.get(str)));
        }
        arxc.y(parcel, 2, arrayList, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
