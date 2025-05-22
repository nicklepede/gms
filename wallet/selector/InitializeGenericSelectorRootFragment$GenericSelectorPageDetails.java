package com.google.android.gms.wallet.selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dlfe;
import defpackage.ekqp;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InitializeGenericSelectorRootFragment$GenericSelectorPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dlfe();

    public InitializeGenericSelectorRootFragment$GenericSelectorPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) ekqp.a.iQ(7, null);
    }

    public InitializeGenericSelectorRootFragment$GenericSelectorPageDetails(Parcel parcel) {
        super(parcel);
    }
}
