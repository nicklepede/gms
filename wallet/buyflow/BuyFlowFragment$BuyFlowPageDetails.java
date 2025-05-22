package com.google.android.gms.wallet.buyflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dkuy;
import defpackage.ejxn;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyFlowFragment$BuyFlowPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dkuy();

    public BuyFlowFragment$BuyFlowPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) ejxn.b.iQ(7, null);
    }

    public BuyFlowFragment$BuyFlowPageDetails(Parcel parcel) {
        super(parcel);
    }

    public BuyFlowFragment$BuyFlowPageDetails(PageDetails pageDetails) {
        super(pageDetails);
    }
}
