package com.google.android.gms.wallet.buyflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dijo;
import defpackage.ehkh;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BuyFlowFragment$BuyFlowPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dijo();

    public BuyFlowFragment$BuyFlowPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) ehkh.b.iB(7, null);
    }

    public BuyFlowFragment$BuyFlowPageDetails(Parcel parcel) {
        super(parcel);
    }

    public BuyFlowFragment$BuyFlowPageDetails(PageDetails pageDetails) {
        super(pageDetails);
    }
}
