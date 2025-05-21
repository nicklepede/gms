package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmby;
import defpackage.cmbz;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TextAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new cmbz();
    public final String a;
    public final int b;
    public final long c;
    public final Bundle d;
    public final String e;
    public final long f;
    public final boolean g;

    public TextAttachment(String str, int i, long j, Bundle bundle, String str2, long j2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = bundle;
        this.e = str2;
        this.f = j2;
        this.g = z;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long b() {
        return this.f;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long c() {
        return this.c;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final Bundle d() {
        return this.d;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final cmby f() {
        cmby cmbyVar = new cmby(this.a);
        cmbyVar.c = this.b;
        cmbyVar.d = this.c;
        cmbyVar.e = this.e;
        cmbyVar.f = this.g;
        return cmbyVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextAttachment) {
            TextAttachment textAttachment = (TextAttachment) obj;
            if (arwb.b(this.a, textAttachment.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(textAttachment.b)) && arwb.b(Long.valueOf(this.c), Long.valueOf(textAttachment.c)) && arwb.b(this.e, textAttachment.e) && arwb.b(Long.valueOf(this.f), Long.valueOf(textAttachment.f)) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(textAttachment.g))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int h() {
        return 3;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Long.valueOf(this.c), this.e, Long.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(this.f);
        String str = this.a;
        int i = this.b;
        return String.format(locale, "TextAttachment<id: %s, textBody: %s, type: %s, size: %s, title: %s, isSensitiveText: %s>", valueOf, str, i != 0 ? i != 1 ? i != 2 ? i != 3 ? String.format(Locale.US, "[%d] UNKNOWN", Integer.valueOf(i)) : "PHONE_NUMBER" : "ADDRESS" : "URL" : "TEXT", Long.valueOf(this.c), this.e, Boolean.valueOf(this.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.g(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.q(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
