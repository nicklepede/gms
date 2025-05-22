package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnwq;
import defpackage.cnwr;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FileAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new cnwr();
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
    public final cnwq f() {
        cnwq cnwqVar = new cnwq(this.a);
        cnwqVar.a = this.g;
        cnwqVar.b = this.d;
        cnwqVar.c = this.c;
        cnwqVar.d = this.b;
        cnwqVar.e = this.f;
        cnwqVar.f = this.h;
        cnwqVar.g = this.i;
        cnwqVar.h = this.j;
        cnwqVar.i = this.k;
        return cnwqVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FileAttachment) {
            FileAttachment fileAttachment = (FileAttachment) obj;
            if (atyq.b(this.a, fileAttachment.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(fileAttachment.b)) && atyq.b(Long.valueOf(this.c), Long.valueOf(fileAttachment.c)) && atyq.b(this.d, fileAttachment.d) && atyq.b(this.f, fileAttachment.f) && atyq.b(Long.valueOf(this.g), Long.valueOf(fileAttachment.g)) && atyq.b(this.h, fileAttachment.h) && atyq.b(Long.valueOf(this.i), Long.valueOf(fileAttachment.i)) && atyq.b(Long.valueOf(this.j), Long.valueOf(fileAttachment.j)) && atyq.b(Boolean.valueOf(this.k), Boolean.valueOf(fileAttachment.k))) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.g(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.q(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.q(parcel, 9, this.i);
        atzr.q(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.c(parcel, a);
    }
}
