package com.google.android.gms.wallet.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dleu;
import defpackage.fdja;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PmRootFragment$PurchaseManagerPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dleu();

    public PmRootFragment$PurchaseManagerPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) fdja.a.iQ(7, null);
    }

    public PmRootFragment$PurchaseManagerPageDetails(Parcel parcel) {
        super(parcel);
    }
}
