package com.google.android.gms.locationsharing.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.casl;
import defpackage.casm;
import defpackage.fgty;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class TosUiDescription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new casm();
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final byte[] h;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Section extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new casl();
        public final String a;
        public final String b;
        public final String c;

        public Section(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 1, str, false);
            arxc.v(parcel, 2, this.b, false);
            arxc.v(parcel, 3, this.c, false);
            arxc.c(parcel, a);
        }
    }

    public TosUiDescription(String str, String str2, List list, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bArr;
    }

    public static String a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((fgty) it.next()).b;
            sb.append("<br><br>");
            sb.append(str);
        }
        return sb.substring(8);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.y(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.i(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }
}
