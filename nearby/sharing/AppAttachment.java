package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cntl;
import defpackage.cntm;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AppAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new cntm();
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
    public final cntl f() {
        cntl cntlVar = new cntl(this.a);
        cntlVar.a = this.e;
        cntlVar.b = this.b;
        cntlVar.c = this.c;
        cntlVar.d = this.f;
        cntlVar.e = this.g;
        cntlVar.f = this.h;
        cntlVar.g = this.i;
        return cntlVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppAttachment) {
            AppAttachment appAttachment = (AppAttachment) obj;
            if (atyq.b(this.a, appAttachment.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(appAttachment.b)) && atyq.b(Long.valueOf(this.e), Long.valueOf(appAttachment.e)) && atyq.b(this.h, appAttachment.h) && Arrays.equals(this.c, appAttachment.c) && Arrays.equals(this.f, appAttachment.f)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.w(parcel, 3, this.c, false);
        atzr.g(parcel, 4, this.d, false);
        atzr.q(parcel, 5, this.e);
        atzr.w(parcel, 6, this.f, false);
        atzr.r(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.e(parcel, 9, this.i);
        atzr.c(parcel, a);
    }
}
