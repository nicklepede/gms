package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkpj;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dkpj();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.e(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.e(parcel, 5, this.d);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.v(parcel, 8, this.g, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.e(parcel, 10, this.i);
        atzr.e(parcel, 11, this.j);
        atzr.J(parcel, 12, this.k, i);
        atzr.e(parcel, 13, this.l);
        atzr.e(parcel, 14, this.m);
        atzr.y(parcel, 15, this.n, false);
        atzr.t(parcel, 16, this.o, i, false);
        atzr.E(parcel, 17, this.p);
        atzr.v(parcel, 18, this.q, false);
        atzr.c(parcel, a);
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
