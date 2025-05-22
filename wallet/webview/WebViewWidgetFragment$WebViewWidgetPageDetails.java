package com.google.android.gms.wallet.webview;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dlum;
import defpackage.fdkh;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WebViewWidgetFragment$WebViewWidgetPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dlum();

    public WebViewWidgetFragment$WebViewWidgetPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) fdkh.a.iQ(7, null);
    }

    public WebViewWidgetFragment$WebViewWidgetPageDetails(Parcel parcel) {
        super(parcel);
    }
}
