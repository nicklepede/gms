package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.clld;
import defpackage.clle;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AppAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new clle();
    public final String a;
    public final long b;
    public final String[] c;
    public final Bundle d;
    public final long e;
    public final String[] f;
    public final long[] g;
    public final String h;
    public final boolean i;

    public AppAttachment(String str, long j, String[] strArr, Bundle bundle, long j2, String[] strArr2, long[] jArr, String str2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = strArr;
        this.d = bundle;
        this.e = j2;
        this.f = strArr2;
        this.g = jArr;
        this.h = str2;
        this.i = z;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long b() {
        return this.e;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long c() {
        return this.b;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final Bundle d() {
        return this.d;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final clld f() {
        clld clldVar = new clld(this.a);
        clldVar.a = this.e;
        clldVar.b = this.b;
        clldVar.c = this.c;
        clldVar.d = this.f;
        clldVar.e = this.g;
        clldVar.f = this.h;
        clldVar.g = this.i;
        return clldVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppAttachment) {
            AppAttachment appAttachment = (AppAttachment) obj;
            if (arwb.b(this.a, appAttachment.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(appAttachment.b)) && arwb.b(Long.valueOf(this.e), Long.valueOf(appAttachment.e)) && arwb.b(this.h, appAttachment.h) && Arrays.equals(this.c, appAttachment.c) && Arrays.equals(this.f, appAttachment.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final boolean g() {
        return this.i;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int h() {
        return 5;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.e), this.h, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.f))});
    }

    public final String toString() {
        return String.format(Locale.US, "AppAttachment<id: %s, appName: %s, size: %s, paths: %s, fileNames: %s, fileSizes: %s, packageName: %s, isSensitive: %s>", Long.valueOf(this.e), this.a, Long.valueOf(this.b), Arrays.toString(this.c), Arrays.toString(this.f), Arrays.toString(this.g), this.h, Boolean.valueOf(this.i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.w(parcel, 3, this.c, false);
        arxc.g(parcel, 4, this.d, false);
        arxc.q(parcel, 5, this.e);
        arxc.w(parcel, 6, this.f, false);
        arxc.r(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.e(parcel, 9, this.i);
        arxc.c(parcel, a);
    }
}
