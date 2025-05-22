package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnh;
import defpackage.fdfq;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SetupWizardInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnh();

    public SetupWizardInitializeRequest(Account account, fdfq fdfqVar) {
        super(account, (fgtg) fdfq.a.iQ(7, null), fdfqVar);
    }

    public SetupWizardInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdfq.a.iQ(7, null), bArr);
    }
}
