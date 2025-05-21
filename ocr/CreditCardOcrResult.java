package com.google.android.gms.ocr;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.csfu;
import defpackage.csfv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class CreditCardOcrResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new csfv();
    public String a;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int[] l;
    public int[] m;
    public String[] n;
    public String[] o;
    public int p;
    public int q;

    private CreditCardOcrResult() {
    }

    public static csfu a() {
        return new csfu(new CreditCardOcrResult());
    }

    public static CreditCardOcrResult b(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT")) {
            return null;
        }
        intent.setExtrasClassLoader(CreditCardOcrResult.class.getClassLoader());
        return (CreditCardOcrResult) intent.getParcelableExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT");
    }

    public final boolean c() {
        return this.c >= 0 && this.b != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.o(parcel, 5, this.d);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.e(parcel, 8, this.g);
        arxc.v(parcel, 9, this.h, false);
        arxc.v(parcel, 10, this.i, false);
        arxc.v(parcel, 11, this.j, false);
        arxc.v(parcel, 12, this.k, false);
        arxc.p(parcel, 13, this.l, false);
        arxc.p(parcel, 14, this.m, false);
        arxc.w(parcel, 15, this.n, false);
        arxc.w(parcel, 16, this.o, false);
        arxc.o(parcel, 17, this.p);
        arxc.o(parcel, 18, this.q);
        arxc.c(parcel, a);
    }

    public CreditCardOcrResult(String str, int i, int i2, int i3, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, int[] iArr, int[] iArr2, String[] strArr, String[] strArr2, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.m = iArr2;
        this.l = iArr;
        this.n = strArr;
        this.o = strArr2;
        this.p = i4;
        this.q = i5;
    }
}
