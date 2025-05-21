package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cloi;
import defpackage.cloj;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FileAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new cloj();
    public final String a;
    public final int b;
    public final long c;
    public final Uri d;
    public final Bundle e;
    public final String f;
    public final long g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    public FileAttachment(String str, int i, long j, Uri uri, Bundle bundle, String str2, long j2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = uri;
        this.e = bundle;
        this.f = str2;
        this.g = j2;
        this.h = str3;
        this.i = j3;
        this.j = j4;
        this.k = z;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long b() {
        return this.g;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long c() {
        return this.c;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final Bundle d() {
        return this.e;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final cloi f() {
        cloi cloiVar = new cloi(this.a);
        cloiVar.a = this.g;
        cloiVar.b = this.d;
        cloiVar.c = this.c;
        cloiVar.d = this.b;
        cloiVar.e = this.f;
        cloiVar.f = this.h;
        cloiVar.g = this.i;
        cloiVar.h = this.j;
        cloiVar.i = this.k;
        return cloiVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FileAttachment) {
            FileAttachment fileAttachment = (FileAttachment) obj;
            if (arwb.b(this.a, fileAttachment.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(fileAttachment.b)) && arwb.b(Long.valueOf(this.c), Long.valueOf(fileAttachment.c)) && arwb.b(this.d, fileAttachment.d) && arwb.b(this.f, fileAttachment.f) && arwb.b(Long.valueOf(this.g), Long.valueOf(fileAttachment.g)) && arwb.b(this.h, fileAttachment.h) && arwb.b(Long.valueOf(this.i), Long.valueOf(fileAttachment.i)) && arwb.b(Long.valueOf(this.j), Long.valueOf(fileAttachment.j)) && arwb.b(Boolean.valueOf(this.k), Boolean.valueOf(fileAttachment.k))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int h() {
        return 2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Long.valueOf(this.c), this.d, this.f, Long.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j), Boolean.valueOf(this.k)});
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(this.g);
        String str2 = this.a;
        int i = this.b;
        switch (i) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "IMAGE";
                break;
            case 2:
                str = "VIDEO";
                break;
            case 3:
                str = "ANDROID_APP";
                break;
            case 4:
                str = "AUDIO";
                break;
            case 5:
                str = "DOCUMENT";
                break;
            case 6:
                str = "CONTACT CARD";
                break;
            default:
                str = String.format(Locale.US, "[%d] UNKNOWN", Integer.valueOf(i));
                break;
        }
        return String.format(locale, "FileAttachment<id: %s, fileName: %s, type: %s, size: %s, uri: %s, mimeType: %s, parentFolder: %s, offset: %s, hash: %s, isSensitiveContent: %s>", valueOf, str2, str, Long.valueOf(this.c), this.d, this.f, this.h, Long.valueOf(this.i), Long.valueOf(this.j), Boolean.valueOf(this.k));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.g(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.q(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.q(parcel, 9, this.i);
        arxc.q(parcel, 10, this.j);
        arxc.e(parcel, 11, this.k);
        arxc.c(parcel, a);
    }
}
