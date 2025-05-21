package com.google.android.gms.wallet.firstparty.setupwizard;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arxc;
import defpackage.diqi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SetupWizardInstrumentManagerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diqi();
    public final Account a;
    public final byte[] b;
    public final BuyFlowConfig c;
    public final String d;
    public final byte[] e;
    final boolean f;
    final boolean g;

    public SetupWizardInstrumentManagerParams(Account account, byte[] bArr, BuyFlowConfig buyFlowConfig, String str, byte[] bArr2, boolean z, boolean z2) {
        this.a = account;
        this.b = bArr;
        this.c = buyFlowConfig;
        this.d = str;
        this.e = bArr2;
        this.f = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.i(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
