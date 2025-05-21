package com.google.android.gms.wallet.timelineview;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.djdz;
import defpackage.favd;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TimelineViewFragment$TimelineViewPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new djdz();

    public TimelineViewFragment$TimelineViewPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) favd.a.iB(7, null);
    }

    public TimelineViewFragment$TimelineViewPageDetails(Parcel parcel) {
        super(parcel);
    }
}
