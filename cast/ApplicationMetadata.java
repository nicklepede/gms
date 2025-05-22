package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aobp;
import defpackage.aozc;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aobp();
    public String a;
    public String b;
    public List c;
    public String d;
    public Uri e;
    public String f;
    public String g;
    public Boolean h;
    public Boolean i;
    public int j;

    public ApplicationMetadata(String str, String str2, List list, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = str5;
        this.h = bool;
        this.i = bool2;
        this.j = i;
    }

    public final boolean a(String str) {
        List list = this.c;
        return list != null && list.contains(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return aozc.u(this.a, applicationMetadata.a) && aozc.u(this.b, applicationMetadata.b) && aozc.u(this.c, applicationMetadata.c) && aozc.u(this.d, applicationMetadata.d) && aozc.u(this.e, applicationMetadata.e) && aozc.u(this.f, applicationMetadata.f) && aozc.u(this.g, applicationMetadata.g) && this.j == applicationMetadata.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.j)});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List list = this.c;
        return "applicationId: " + str + ", name: " + str2 + ", namespaces.count: " + (list == null ? 0 : list.size()) + ", senderAppIdentifier: " + this.d + ", senderAppLaunchUrl: " + String.valueOf(this.e) + ", iconUrl: " + this.f + ", type: " + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.y(parcel, 4, null, false);
        atzr.x(parcel, 5, DesugarCollections.unmodifiableList(this.c), false);
        atzr.v(parcel, 6, this.d, false);
        atzr.t(parcel, 7, this.e, i, false);
        atzr.v(parcel, 8, this.f, false);
        atzr.v(parcel, 9, this.g, false);
        atzr.z(parcel, 10, this.h);
        atzr.z(parcel, 11, this.i);
        atzr.o(parcel, 12, this.j);
        atzr.c(parcel, a);
    }

    public ApplicationMetadata() {
        this.c = new ArrayList();
        this.j = 1;
    }
}
