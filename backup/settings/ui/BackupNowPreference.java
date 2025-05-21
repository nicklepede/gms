package com.google.android.gms.backup.settings.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.ui.BackupNowPreference;
import defpackage.ahwd;
import defpackage.aiem;
import defpackage.ajrc;
import defpackage.arxo;
import defpackage.ekir;
import defpackage.ekjb;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fllt;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupNowPreference extends Preference {
    private static final arxo e = ahwd.a("BackupNowPreference");
    public boolean a;
    public boolean b;
    public final double c;
    public boolean d;
    private Button f;
    private Button g;
    private boolean h;

    public BackupNowPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new ajrc());
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        e.j("onBindViewHolder", new Object[0]);
        super.a(kmpVar);
        this.f = (Button) kmpVar.D(R.id.backup_now_button);
        this.g = (Button) kmpVar.D(R.id.backup_now_button_outlined);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ajxb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupNowPreference backupNowPreference = BackupNowPreference.this;
                klp klpVar = backupNowPreference.o;
                if (klpVar != null) {
                    klpVar.b(backupNowPreference);
                }
            }
        };
        this.f.setOnClickListener(onClickListener);
        this.g.setOnClickListener(onClickListener);
        l();
    }

    public final void k(boolean z) {
        this.h = z;
        l();
    }

    public final void l() {
        boolean z;
        boolean z2;
        if (this.f == null || this.g == null) {
            return;
        }
        arxo arxoVar = e;
        boolean z3 = false;
        arxoVar.d("Updating UI Button state.", new Object[0]);
        if (aiem.a()) {
            arxoVar.d("isBackupInProgress [%b]", Boolean.valueOf(this.d));
        } else {
            arxoVar.d("isBackupInProgress [%b]. isUnlockRequired [%b]", Boolean.valueOf(this.d), Boolean.valueOf(this.h));
        }
        if (this.b) {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            this.f.setVisibility(0);
            this.g.setVisibility(8);
        }
        boolean z4 = !aiem.a() && this.h;
        if (!fllt.a.a().M()) {
            boolean z5 = this.d;
            fecj v = ekir.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            ekir ekirVar = (ekir) fecpVar;
            ekirVar.b |= 1;
            ekirVar.c = z5;
            if (!fecpVar.L()) {
                v.U();
            }
            ekir ekirVar2 = (ekir) v.b;
            ekirVar2.b = 2 | ekirVar2.b;
            ekirVar2.d = z4;
            ekir ekirVar3 = (ekir) v.Q();
            fecj v2 = ekjb.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            ekjb ekjbVar = (ekjb) fecpVar2;
            ekirVar3.getClass();
            ekjbVar.f = ekirVar3;
            ekjbVar.b |= 64;
            if (!fecpVar2.L()) {
                v2.U();
            }
            ekjb ekjbVar2 = (ekjb) v2.b;
            ekjbVar2.e = 10;
            ekjbVar2.b |= 4;
            ajrc.a((ekjb) v2.Q());
            Button button = this.f;
            if (this.d) {
                z = false;
            } else if (z4) {
                z = false;
                z4 = true;
            } else {
                z4 = false;
                z = true;
            }
            button.setEnabled(z);
            Button button2 = this.g;
            if (!this.d && !z4) {
                z3 = true;
            }
            button2.setEnabled(z3);
            return;
        }
        arxoVar.d("isUserStorageFull [%b]", Boolean.valueOf(this.a));
        boolean z6 = this.d;
        boolean z7 = this.a;
        fecj v3 = ekir.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar3 = v3.b;
        ekir ekirVar4 = (ekir) fecpVar3;
        ekirVar4.b |= 1;
        ekirVar4.c = z6;
        if (!fecpVar3.L()) {
            v3.U();
        }
        fecp fecpVar4 = v3.b;
        ekir ekirVar5 = (ekir) fecpVar4;
        ekirVar5.b = 2 | ekirVar5.b;
        ekirVar5.d = z4;
        if (!fecpVar4.L()) {
            v3.U();
        }
        ekir ekirVar6 = (ekir) v3.b;
        ekirVar6.b |= 4;
        ekirVar6.e = z7;
        ekir ekirVar7 = (ekir) v3.Q();
        fecj v4 = ekjb.a.v();
        if (!v4.b.L()) {
            v4.U();
        }
        fecp fecpVar5 = v4.b;
        ekjb ekjbVar3 = (ekjb) fecpVar5;
        ekirVar7.getClass();
        ekjbVar3.f = ekirVar7;
        ekjbVar3.b |= 64;
        if (!fecpVar5.L()) {
            v4.U();
        }
        ekjb ekjbVar4 = (ekjb) v4.b;
        ekjbVar4.e = 10;
        ekjbVar4.b |= 4;
        ajrc.a((ekjb) v4.Q());
        Button button3 = this.f;
        if (this.d) {
            z2 = false;
        } else if (z4) {
            z2 = false;
            z4 = true;
        } else if (this.a) {
            z4 = false;
            z2 = false;
        } else {
            z4 = false;
            z2 = true;
        }
        button3.setEnabled(z2);
        Button button4 = this.g;
        if (!this.d && !z4 && !this.a) {
            z3 = true;
        }
        button4.setEnabled(z3);
    }

    public BackupNowPreference(Context context, AttributeSet attributeSet, ajrc ajrcVar) {
        super(context, attributeSet);
        this.c = fllt.b();
        this.B = R.layout.material_backup_now_button;
        this.w = false;
        N(false);
    }
}
