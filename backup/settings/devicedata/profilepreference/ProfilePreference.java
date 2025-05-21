package com.google.android.gms.backup.settings.devicedata.profilepreference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.ajhn;
import defpackage.ajho;
import defpackage.ajhp;
import defpackage.asmf;
import defpackage.dtmk;
import defpackage.dtyl;
import defpackage.dtyz;
import defpackage.fvbo;
import defpackage.kmp;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ProfilePreference extends Preference {
    public ajho a;
    public ajhp b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePreference(Context context) {
        this(context, null, 0, 0, 14, null);
        fvbo.f(context, "context");
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        ajhp ajhpVar;
        fvbo.f(kmpVar, "holder");
        super.a(kmpVar);
        View D = kmpVar.D(R.id.backup_settings_devicedata_profile_preference_account_view);
        fvbo.d(D, "null cannot be cast to non-null type com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc<com.google.android.libraries.onegoogle.accountmenu.gmscommon.DeviceOwner>");
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) D;
        accountParticleDisc.n(true);
        if (this.b == null) {
            throw new IllegalStateException("AccountParticleDiscInitializer not set in ProfilePreference.");
        }
        if (!accountParticleDisc.u() && (ajhpVar = this.b) != null) {
            Context context = this.j;
            fvbo.e(context, "getContext(...)");
            fvbo.f(context, "context");
            fvbo.f(accountParticleDisc, "disc");
            dtyl dtylVar = new dtyl();
            accountParticleDisc.i(new dtmk(context, new asmf(Integer.MAX_VALUE, 9), dtylVar, new dtyz(context, ajhpVar.a)), dtylVar);
        }
        ajho ajhoVar = this.a;
        if (!(ajhoVar instanceof ajhn)) {
            accountParticleDisc.setVisibility(8);
        } else {
            accountParticleDisc.m(((ajhn) ajhoVar).b);
            accountParticleDisc.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fvbo.f(context, "context");
        this.B = R.layout.backup_settings_devicedata_profile_preference;
    }

    public /* synthetic */ ProfilePreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
