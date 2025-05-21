package com.google.android.gms.wallet.firstparty.setupwizard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diqh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetSetupWizardIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diqh();
    public final int a;
    public final SetupWizardInstrumentManagerParams b;

    public GetSetupWizardIntentRequest(int i, SetupWizardInstrumentManagerParams setupWizardInstrumentManagerParams) {
        this.a = i;
        this.b = setupWizardInstrumentManagerParams;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
