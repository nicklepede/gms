package com.google.android.gms.appdatasearch;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.voa;
import defpackage.vpa;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vpa();
    public final DocumentId a;
    public final long b;
    public int c;
    public final String d;
    public final DocumentContents e;
    public final boolean f;
    final int g;
    public int h;
    public final String i;

    public UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3, String str2) {
        this.a = documentId;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = documentContents;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = str2;
    }

    public static DocumentSection a(String str, String str2) {
        voa voaVar = new voa(str);
        voaVar.b = true;
        return new DocumentSection(str2, voaVar.a());
    }

    public static DocumentSection b(String str) {
        voa voaVar = new voa("title");
        voaVar.d = true;
        voaVar.f = "name";
        return new DocumentSection(str, voaVar.a());
    }

    public static DocumentSection c(Uri uri) {
        String uri2 = uri.toString();
        voa voaVar = new voa("web_url");
        voaVar.b = true;
        voaVar.f = "url";
        return new DocumentSection(uri2, voaVar.a());
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.q(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.e(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        atzr.c(parcel, a);
    }
}
