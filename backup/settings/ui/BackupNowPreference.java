package com.google.android.gms.backup.settings.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.ui.BackupNowPreference;
import defpackage.ajwt;
import defpackage.akfc;
import defpackage.alrv;
import defpackage.auad;
import defpackage.emwd;
import defpackage.emwn;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fodd;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupNowPreference extends Preference {
    private static final auad e = ajwt.a("BackupNowPreference");
    public boolean a;
    public boolean b;
    public final double c;
    public boolean d;
    private Button f;
    private Button g;
    private boolean h;

    public BackupNowPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new alrv());
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        e.j("onBindViewHolder", new Object[0]);
        super.a(mfaVar);
        this.f = (Button) mfaVar.D(R.id.backup_now_button);
        this.g = (Button) mfaVar.D(R.id.backup_now_button_outlined);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: alxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupNowPreference backupNowPreference = BackupNowPreference.this;
                mea meaVar = backupNowPreference.o;
                if (meaVar != null) {
                    meaVar.b(backupNowPreference);
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
        auad auadVar = e;
        boolean z3 = false;
        auadVar.d("Updating UI Button state.", new Object[0]);
        if (akfc.a()) {
            auadVar.d("isBackupInProgress [%b]", Boolean.valueOf(this.d));
        } else {
            auadVar.d("isBackupInProgress [%b]. isUnlockRequired [%b]", Boolean.valueOf(this.d), Boolean.valueOf(this.h));
        }
        if (this.b) {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            this.f.setVisibility(0);
            this.g.setVisibility(8);
        }
        boolean z4 = !akfc.a() && this.h;
        if (!fodd.a.lK().M()) {
            boolean z5 = this.d;
            fgrc v = emwd.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            emwd emwdVar = (emwd) fgriVar;
            emwdVar.b |= 1;
            emwdVar.c = z5;
            if (!fgriVar.L()) {
                v.U();
            }
            emwd emwdVar2 = (emwd) v.b;
            emwdVar2.b = 2 | emwdVar2.b;
            emwdVar2.d = z4;
            emwd emwdVar3 = (emwd) v.Q();
            fgrc v2 = emwn.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            emwn emwnVar = (emwn) fgriVar2;
            emwdVar3.getClass();
            emwnVar.f = emwdVar3;
            emwnVar.b |= 64;
            if (!fgriVar2.L()) {
                v2.U();
            }
            emwn emwnVar2 = (emwn) v2.b;
            emwnVar2.e = 10;
            emwnVar2.b |= 4;
            alrv.a((emwn) v2.Q());
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
        auadVar.d("isUserStorageFull [%b]", Boolean.valueOf(this.a));
        boolean z6 = this.d;
        boolean z7 = this.a;
        fgrc v3 = emwd.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar3 = v3.b;
        emwd emwdVar4 = (emwd) fgriVar3;
        emwdVar4.b |= 1;
        emwdVar4.c = z6;
        if (!fgriVar3.L()) {
            v3.U();
        }
        fgri fgriVar4 = v3.b;
        emwd emwdVar5 = (emwd) fgriVar4;
        emwdVar5.b = 2 | emwdVar5.b;
        emwdVar5.d = z4;
        if (!fgriVar4.L()) {
            v3.U();
        }
        emwd emwdVar6 = (emwd) v3.b;
        emwdVar6.b |= 4;
        emwdVar6.e = z7;
        emwd emwdVar7 = (emwd) v3.Q();
        fgrc v4 = emwn.a.v();
        if (!v4.b.L()) {
            v4.U();
        }
        fgri fgriVar5 = v4.b;
        emwn emwnVar3 = (emwn) fgriVar5;
        emwdVar7.getClass();
        emwnVar3.f = emwdVar7;
        emwnVar3.b |= 64;
        if (!fgriVar5.L()) {
            v4.U();
        }
        emwn emwnVar4 = (emwn) v4.b;
        emwnVar4.e = 10;
        emwnVar4.b |= 4;
        alrv.a((emwn) v4.Q());
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

    public BackupNowPreference(Context context, AttributeSet attributeSet, alrv alrvVar) {
        super(context, attributeSet);
        this.c = fodd.b();
        this.B = R.layout.material_backup_now_button;
        this.w = false;
        N(false);
    }
}
