package com.google.android.gms.wallet.setupwizard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dlou;
import defpackage.fdfu;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dlou();

    public PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) fdfu.a.iQ(7, null);
    }

    public PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails(Parcel parcel) {
        super(parcel);
    }
}
