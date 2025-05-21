package com.google.android.gms.wallet.webview;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.djit;
import defpackage.favr;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WebViewWidgetFragment$WebViewWidgetPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new djit();

    public WebViewWidgetFragment$WebViewWidgetPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) favr.a.iB(7, null);
    }

    public WebViewWidgetFragment$WebViewWidgetPageDetails(Parcel parcel) {
        super(parcel);
    }
}
