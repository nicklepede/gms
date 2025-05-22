package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cokg;
import defpackage.cokh;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TextAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new cokh();
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
    public final cokg f() {
        cokg cokgVar = new cokg(this.a);
        cokgVar.c = this.b;
        cokgVar.d = this.c;
        cokgVar.e = this.e;
        cokgVar.f = this.g;
        return cokgVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextAttachment) {
            TextAttachment textAttachment = (TextAttachment) obj;
            if (atyq.b(this.a, textAttachment.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(textAttachment.b)) && atyq.b(Long.valueOf(this.c), Long.valueOf(textAttachment.c)) && atyq.b(this.e, textAttachment.e) && atyq.b(Long.valueOf(this.f), Long.valueOf(textAttachment.f)) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(textAttachment.g))) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.g(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.q(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
