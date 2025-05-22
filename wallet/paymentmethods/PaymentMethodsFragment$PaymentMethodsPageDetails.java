package com.google.android.gms.wallet.paymentmethods;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dleo;
import defpackage.ekry;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentMethodsFragment$PaymentMethodsPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dleo();

    public PaymentMethodsFragment$PaymentMethodsPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) ekry.a.iQ(7, null);
    }

    public PaymentMethodsFragment$PaymentMethodsPageDetails(Parcel parcel) {
        super(parcel);
    }
}
