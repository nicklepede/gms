package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlni;
import defpackage.fdfw;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SetupWizardSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlni();

    public SetupWizardSubmitRequest(Account account, fdfw fdfwVar, List list) {
        super(account, (fgtg) fdfw.a.iQ(7, null), fdfwVar, list);
    }

    public SetupWizardSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) fdfw.a.iQ(7, null), bArr, list);
    }
}
