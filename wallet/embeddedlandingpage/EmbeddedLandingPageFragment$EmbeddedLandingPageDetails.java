package com.google.android.gms.wallet.embeddedlandingpage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dkzs;
import defpackage.fdin;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EmbeddedLandingPageFragment$EmbeddedLandingPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dkzs();

    public EmbeddedLandingPageFragment$EmbeddedLandingPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) fdin.a.iQ(7, null);
    }

    public EmbeddedLandingPageFragment$EmbeddedLandingPageDetails(Parcel parcel) {
        super(parcel);
    }
}
