package com.google.android.gms.backup.settings.devicedata.profilepreference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.alif;
import defpackage.alig;
import defpackage.alih;
import defpackage.aupz;
import defpackage.dvww;
import defpackage.dwix;
import defpackage.dwjl;
import defpackage.fxxm;
import defpackage.mfa;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ProfilePreference extends Preference {
    public alig a;
    public alih b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePreference(Context context) {
        this(context, null, 0, 0, 14, null);
        fxxm.f(context, "context");
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        alih alihVar;
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        View D = mfaVar.D(R.id.backup_settings_devicedata_profile_preference_account_view);
        fxxm.d(D, "null cannot be cast to non-null type com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc<com.google.android.libraries.onegoogle.accountmenu.gmscommon.DeviceOwner>");
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) D;
        accountParticleDisc.n(true);
        if (this.b == null) {
            throw new IllegalStateException("AccountParticleDiscInitializer not set in ProfilePreference.");
        }
        if (!accountParticleDisc.u() && (alihVar = this.b) != null) {
            Context context = this.j;
            fxxm.e(context, "getContext(...)");
            fxxm.f(context, "context");
            fxxm.f(accountParticleDisc, "disc");
            dwix dwixVar = new dwix();
            accountParticleDisc.i(new dvww(context, new aupz(Integer.MAX_VALUE, 9), dwixVar, new dwjl(context, alihVar.a)), dwixVar);
        }
        alig aligVar = this.a;
        if (!(aligVar instanceof alif)) {
            accountParticleDisc.setVisibility(8);
        } else {
            accountParticleDisc.m(((alif) aligVar).b);
            accountParticleDisc.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fxxm.f(context, "context");
        this.B = R.layout.backup_settings_devicedata_profile_preference;
    }

    public /* synthetic */ ProfilePreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
