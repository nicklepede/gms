package com.google.android.gms.wallet.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dirl;
import defpackage.eieb;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ImRootFragment$InstrumentManagerPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dirl();

    public ImRootFragment$InstrumentManagerPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) eieb.a.iB(7, null);
    }

    public ImRootFragment$InstrumentManagerPageDetails(Parcel parcel) {
        super(parcel);
    }
}
