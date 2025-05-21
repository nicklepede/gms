package com.google.android.gms.wallet.setupwizard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.djdb;
import defpackage.farf;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new djdb();

    public PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) farf.a.iB(7, null);
    }

    public PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails(Parcel parcel) {
        super(parcel);
    }
}
