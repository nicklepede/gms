package com.google.android.gms.appdatasearch;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.tsa;
import defpackage.tta;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tta();
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
        tsa tsaVar = new tsa(str);
        tsaVar.b = true;
        return new DocumentSection(str2, tsaVar.a());
    }

    public static DocumentSection b(String str) {
        tsa tsaVar = new tsa("title");
        tsaVar.d = true;
        tsaVar.f = "name";
        return new DocumentSection(str, tsaVar.a());
    }

    public static DocumentSection c(Uri uri) {
        String uri2 = uri.toString();
        tsa tsaVar = new tsa("web_url");
        tsaVar.b = true;
        tsaVar.f = "url";
        return new DocumentSection(uri2, tsaVar.a());
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.q(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.e(parcel, 6, this.f);
        arxc.o(parcel, 7, this.g);
        arxc.o(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        arxc.c(parcel, a);
    }
}
