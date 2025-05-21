package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.didy;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new didy();
    public String a;
    public boolean b;
    public boolean c;
    boolean d;
    public String e;
    public String f;
    public String g;
    public Cart h;
    boolean i;
    boolean j;
    CountrySpecification[] k;
    public final boolean l;
    public final boolean m;
    public ArrayList n;
    public PaymentMethodTokenizationParameters o;
    public ArrayList p;
    public String q;

    public MaskedWalletRequest() {
        this.l = true;
        this.m = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.e(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.t(parcel, 9, this.h, i, false);
        arxc.e(parcel, 10, this.i);
        arxc.e(parcel, 11, this.j);
        arxc.J(parcel, 12, this.k, i);
        arxc.e(parcel, 13, this.l);
        arxc.e(parcel, 14, this.m);
        arxc.y(parcel, 15, this.n, false);
        arxc.t(parcel, 16, this.o, i, false);
        arxc.E(parcel, 17, this.p);
        arxc.v(parcel, 18, this.q, false);
        arxc.c(parcel, a);
    }

    public MaskedWalletRequest(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList arrayList2, String str5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = cart;
        this.i = z4;
        this.j = z5;
        this.k = countrySpecificationArr;
        this.l = z6;
        this.m = z7;
        this.n = arrayList;
        this.o = paymentMethodTokenizationParameters;
        this.p = arrayList2;
        this.q = str5;
    }
}
