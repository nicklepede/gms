package com.google.android.gms.locationsharing.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdbb;
import defpackage.cdbc;
import defpackage.fjiw;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TosUiDescription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdbc();
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final byte[] h;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Section extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cdbb();
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
            int a = atzr.a(parcel);
            atzr.v(parcel, 1, str, false);
            atzr.v(parcel, 2, this.b, false);
            atzr.v(parcel, 3, this.c, false);
            atzr.c(parcel, a);
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
            String str = ((fjiw) it.next()).b;
            sb.append("<br><br>");
            sb.append(str);
        }
        return sb.substring(8);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.i(parcel, 8, this.h, false);
        atzr.c(parcel, a);
    }
}
