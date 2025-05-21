package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbo;
import defpackage.farb;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SetupWizardInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbo();

    public SetupWizardInitializeRequest(Account account, farb farbVar) {
        super(account, (feen) farb.a.iB(7, null), farbVar);
    }

    public SetupWizardInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) farb.a.iB(7, null), bArr);
    }
}
