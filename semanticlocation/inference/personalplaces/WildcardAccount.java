package com.google.android.gms.semanticlocation.inference.personalplaces;

import android.accounts.Account;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class WildcardAccount extends Account {
    public static final WildcardAccount a = new WildcardAccount();

    private WildcardAccount() {
        super("*", "*");
    }
}
