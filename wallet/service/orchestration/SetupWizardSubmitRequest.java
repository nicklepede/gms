package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbp;
import defpackage.farh;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SetupWizardSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbp();

    public SetupWizardSubmitRequest(Account account, farh farhVar, List list) {
        super(account, (feen) farh.a.iB(7, null), farhVar, list);
    }

    public SetupWizardSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (feen) farh.a.iB(7, null), bArr, list);
    }
}
