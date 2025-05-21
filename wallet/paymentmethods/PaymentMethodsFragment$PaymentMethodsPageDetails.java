package com.google.android.gms.wallet.paymentmethods;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.ditd;
import defpackage.eies;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentMethodsFragment$PaymentMethodsPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new ditd();

    public PaymentMethodsFragment$PaymentMethodsPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) eies.a.iB(7, null);
    }

    public PaymentMethodsFragment$PaymentMethodsPageDetails(Parcel parcel) {
        super(parcel);
    }
}
