package com.google.android.gms.backup.settings.devicedata.mainswitchpreference2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.TwoStatePreference;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.devicedata.mainswitchpreference2.MainSwitchPreference2;
import defpackage.kmp;
import defpackage.nfx;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MainSwitchPreference2 extends TwoStatePreference implements CompoundButton.OnCheckedChangeListener, nfx {
    private final List c;

    public MainSwitchPreference2(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        kmpVar.v = false;
        kmpVar.w = false;
        MainSwitchBar2 mainSwitchBar2 = (MainSwitchBar2) kmpVar.a.findViewById(R.id.settingslib_main_switch_bar);
        mainSwitchBar2.d(t());
        mainSwitchBar2.c(m());
        boolean z = this.z;
        TextView textView = mainSwitchBar2.b;
        if (textView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            int dimensionPixelSize = mainSwitchBar2.getContext().getResources().getDimensionPixelSize(R.dimen.backup_settingslib_switchbar_subsettings_margin_start);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) Objects.requireNonNull(layoutParams);
            if (true != z) {
                dimensionPixelSize = 0;
            }
            layoutParams2.setMarginStart(dimensionPixelSize);
            mainSwitchBar2.b.setLayoutParams(layoutParams);
        }
        mainSwitchBar2.setOnClickListener(new View.OnClickListener() { // from class: ajon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainSwitchPreference2 mainSwitchPreference2 = MainSwitchPreference2.this;
                mainSwitchPreference2.W(Boolean.valueOf(((TwoStatePreference) mainSwitchPreference2).a));
            }
        });
        mainSwitchBar2.a.clear();
        mainSwitchBar2.b(((TwoStatePreference) this).a);
        mainSwitchBar2.a(this);
        mainSwitchBar2.setVisibility(0);
        mainSwitchBar2.d.setOnCheckedChangeListener(mainSwitchBar2);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        super.k(z);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((CompoundButton.OnCheckedChangeListener) it.next()).onCheckedChanged(compoundButton, z);
        }
    }

    public MainSwitchPreference2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MainSwitchPreference2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MainSwitchPreference2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new ArrayList();
        this.B = R.layout.backup_settingslib_expressive_main_switch_layout;
    }
}
