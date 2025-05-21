package com.google.android.gms.wallet.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.ditj;
import defpackage.faul;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PmRootFragment$PurchaseManagerPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new ditj();

    public PmRootFragment$PurchaseManagerPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) faul.a.iB(7, null);
    }

    public PmRootFragment$PurchaseManagerPageDetails(Parcel parcel) {
        super(parcel);
    }
}
