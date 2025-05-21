package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amae;
import defpackage.amxr;
import defpackage.arxc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amae();
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
        return amxr.u(this.a, applicationMetadata.a) && amxr.u(this.b, applicationMetadata.b) && amxr.u(this.c, applicationMetadata.c) && amxr.u(this.d, applicationMetadata.d) && amxr.u(this.e, applicationMetadata.e) && amxr.u(this.f, applicationMetadata.f) && amxr.u(this.g, applicationMetadata.g) && this.j == applicationMetadata.j;
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.y(parcel, 4, null, false);
        arxc.x(parcel, 5, DesugarCollections.unmodifiableList(this.c), false);
        arxc.v(parcel, 6, this.d, false);
        arxc.t(parcel, 7, this.e, i, false);
        arxc.v(parcel, 8, this.f, false);
        arxc.v(parcel, 9, this.g, false);
        arxc.z(parcel, 10, this.h);
        arxc.z(parcel, 11, this.i);
        arxc.o(parcel, 12, this.j);
        arxc.c(parcel, a);
    }

    public ApplicationMetadata() {
        this.c = new ArrayList();
        this.j = 1;
    }
}
