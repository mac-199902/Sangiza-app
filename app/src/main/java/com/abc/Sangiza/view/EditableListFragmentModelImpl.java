package com.abc.Sangiza.view;

import com.abc.Sangiza.fragment.EditableListFragment;
import com.abc.Sangiza.widget.EditableListAdapter;

public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}
