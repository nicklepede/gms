package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dlpa;
import defpackage.dlpb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dlpb();
    public String a;
    public ApplicationParameters b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;

    public BuyFlowConfig() {
    }

    public static dlpa a() {
        return new dlpa(new BuyFlowConfig());
    }

    public static dlpa b(BuyFlowConfig buyFlowConfig) {
        dlpa a = a();
        a.b(buyFlowConfig.b);
        a.c(buyFlowConfig.c());
        a.d(buyFlowConfig.c);
        a.e(buyFlowConfig.d);
        a.f(buyFlowConfig.a);
        BuyFlowConfig buyFlowConfig2 = a.a;
        buyFlowConfig2.f = buyFlowConfig.f;
        buyFlowConfig2.g = buyFlowConfig.g;
        return a;
    }

    public final String c() {
        return TextUtils.isEmpty(this.e) ? this.c : this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dlpb.a(this, parcel, i);
    }

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = applicationParameters;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
    }
}
