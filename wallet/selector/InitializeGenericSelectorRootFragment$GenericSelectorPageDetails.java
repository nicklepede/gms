package com.google.android.gms.wallet.selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.ditt;
import defpackage.eidj;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InitializeGenericSelectorRootFragment$GenericSelectorPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new ditt();

    public InitializeGenericSelectorRootFragment$GenericSelectorPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) eidj.a.iB(7, null);
    }

    public InitializeGenericSelectorRootFragment$GenericSelectorPageDetails(Parcel parcel) {
        super(parcel);
    }
}
